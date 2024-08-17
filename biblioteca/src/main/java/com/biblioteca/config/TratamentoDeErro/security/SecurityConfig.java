package com.biblioteca.config.TratamentoDeErro.security;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@SecurityScheme(type = SecuritySchemeType.HTTP, scheme = "basic", name = "SecurityAuth")
@EnableWebSecurity
public class SecurityConfig {

    private final String[] WHITE_LIST = new String[]{
            "/auth/**",
            "/index.html",
            "/assets/**",
            "/config/**",
            "/controller/**",
            "/directive/**",
            "/factory/**",
            "/filter/**",
            "/modal/**",
            "/module/**",
            "/report/**",
            "/service/**",
            "/template/**",
            "/view/**",
            "/",
            "/swagger-ui**",
            "/swagger-ui/**",
            "/favicon.ico",
            "/v3/api-docs/**",
            "/swagger-ui/index.html",
            "/documentation-api/**",
            "/bling-integracoes/oapi/callbacks/alteracao-estoque/empresa/**"
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Desabilita CSRF se você não estiver usando formulários
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(WHITE_LIST).permitAll() // URLs permitidas
                        .requestMatchers("/css/", "/js/", "/images/", "/webjars/", "/static/", "/public/", "/resources/", "/META-INF/resources/").permitAll()
                        .anyRequest().authenticated() // Todas as outras URLs precisam de autenticação
                )
                .httpBasic() // Habilita apenas autenticação básica
                .and()
                .formLogin().disable(); // Desabilita login forms

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("teste")
                .password("teste")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
