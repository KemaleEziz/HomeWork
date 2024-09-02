package firstpackage;

public class homework {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int result = a+b;
		System.out.println(result);
		System.out.println("Salam");
		System.out.println("Alma");
		System.out.println("Armud");
		
		int c = 20;
		int d = 3;
		int e = c % d;
		int f = c/d;
		int j = c* d;
        System.out.println(e);
        System.out.println(f);
        System.out.println(j);
        
        String name = "Kamala";
        String firstStr = "Mənim adım" + name +"-dır" ;
        System.out.println(firstStr);
        System.out.println("firstStrnin uzunlugu :" + firstStr.length() + "simvoldur");

        char one = 'a';
        char two = '1';
        System.out.println(one);
        System.out.println(two);
	
        
        int number1 = 20;
//      System.out.println(number1.length());
//      Primitv int tipinin length()metodunu  çağırmaq olmaz;
        String word1 = "World";
        String result2 = word1 + number1;
        System.out.println(result2);
        
        String city = " Nyu York";
        int num4 = 21;
        String cityNum = city + "da"+ " " + num4 +" " +"korpu var";
        System.out.println(cityNum);
        System.out.println(cityNum.length());

   }
}
