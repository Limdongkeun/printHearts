
public class solution {

  public static void printHearts(int count){

    String hearts = "♡";
    if(count > 0) {
      for (int i = 1; i <= count; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(hearts);
        }
        System.out.println();
      }
    }else {
      int num = (count * -1);
      for (int i=num;i>0;i--){
        for (int j=0;j<i;j++){
          System.out.print(hearts);
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    printHearts(-4);
  }
}


