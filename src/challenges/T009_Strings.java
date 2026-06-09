package challenges;

public class T009_Strings {
    public static void main(String[] args) {
        /* Whenever we use the direct literal value is assigned to string variable then the memory allocation in the heap are of SCP(String Constant Pool).
            In the SCP the string data duplication is not allowed.
         */
//        String str1 = "Telusko";
//        String str2 = "Telusko";
//        System.out.println(str1 == str2);

        /* Whenever we use the new keyword object is created so for the object creation the memory allocation is in heap are.
            But in the heap area the string data duplication allowed.
         */
//        String str3 = new String("Telusko");
//        String str4 = new String("Telusko");
//        System.out.println(str3 == str4);

//        String str = "RajaRamMohanRoy";
//        System.out.println(str.charAt(3));  //a
//        System.out.println(str.toLowerCase());  //rajarammohanroy
//        System.out.println(str.toUpperCase());  //RAJARAMMOHANROY
//        System.out.println(str.substring(0,4)); //Raja
//        System.out.println(str.getBytes());     //[B@27716f4
//        System.out.println(str.getClass()); //class java.lang.String
//        System.out.println(str.concat(" hi"));  //RajaRamMohanRoy hi
//        System.out.println(str.contains("Ram"));    //true
//        System.out.println(str.startsWith("Raj"));  //true
//        System.out.println(str.startsWith("Raghu"));  //false
//        System.out.println(str.endsWith("Roy"));    //true
//        System.out.println(str.endsWith("Ro"));     //false

        //The compareTo() function will work based on lexicographically.
        String str5 = "Ram";    //82  97  109
        String str6 = "Sham";   //83  104 97  109
        System.out.println(str5.compareTo(str6));   // 82 - 83 = -1

    }
}
