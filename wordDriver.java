public class wordDriver{

  public static void main(String[] args) {

    System.out.println(makingWords.makeAllWords(1,3));
    System.out.println("Should be [a,b,c]");
    System.out.println(makingWords.makeAllWords(1,26));
    System.out.println("Should be a-z");
    System.out.println(makingWords.makeAllWords(3,3));
    System.out.println("Should be aaa, aab, aac ... cca, ccb, ccc");
    System.out.println(makingWords.makeAllWords(4,2));
    System.out.println("Should be aaaa aaab aaba... bbba bbbb");
    System.out.println(makingWords.makeAllWords(2,26));
    System.out.println("Should be aa, ab, ac, ad ... zx, zy, zz");


  }

}
