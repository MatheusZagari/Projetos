public class Wrappers {
    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.0F;
        System.out.println("Float: " + f);

        Double d = 123.123123;
        System.out.println("Double: "+ d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println("Boolean:" + bo);
        System.out.println("Boolean:" + bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println("Character: " + c + "...");

    }
}
