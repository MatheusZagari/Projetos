package Generics;

import java.util.Arrays;
import java.util.List;

public class ListasUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguagem1 = (String) LisaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem1);

        Integer ultimoNumero1 = (Integer) LisaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);


        String ultimaLinguagem2 = LisaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = LisaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero2);

    }
}
