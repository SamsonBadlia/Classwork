import java.util.ArrayList;

public class makingWords{

  public static ArrayList<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> L = new ArrayList<String>();
    wordshelper( k , maxLetter , L , "" );
    return L;
  }

  public static void wordshelper(int k , int maxLetter , ArrayList<String> L , String word){
    if ( k == 0 )  L.add(word);
    else{
      for ( int i = 0 ; i < maxLetter ; i++ ){
        wordshelper ( k - 1 , maxLetter , L , word + (char)(97 + i));
      }
    }
  }

}
