package Stringsinjava;

public class String1 {
	
	
	   static void concate1(String s1) {
		   s1 = s1+"ForGeeks";
		   
	   }
	   
	   static void concate2(StringBuffer s2) {
		   s2.append("Buffer");
	   }
	   
	   static void concate3(StringBuilder s3) {
		   s3.append("Builder");
	   }
	
	
	
//		static void concat(String s1) {
//			s1=s1+"forGeeks";
//		}
//		static void concat1(StringBuilder s2) {
//			s2.append("Builder");
//		}
//		static void concat2(StringBuffer s3) {
//			s3.append("Buffer");
//		}

		public static void main(String[] args) {
//	     String s1="Geeks";
//	     concat(s1);
//	     System.out.println("String :"+s1);
//	     StringBuilder s2=new StringBuilder("String");
//	     concat1(s2);
//	     System.out.println("String Builder:"+s2);
//	     StringBuffer s3=new StringBuffer("String");
//	     concat2(s3);
//	     System.out.println("String buffer:"+s3);
	     
	     String s1 = "Geeks";
	     concate1(s1);
	     System.out.println("String :" +s1);
	     StringBuffer s2 = new StringBuffer("String");
	     concate2(s2);
	     System.out.println("StringBuilder:" +s2);
	     StringBuilder s3 = new StringBuilder("String");
	     concate3(s3);
	     System.out.println("StringBuffer:" +s3);
	     
	     
		}

	}


