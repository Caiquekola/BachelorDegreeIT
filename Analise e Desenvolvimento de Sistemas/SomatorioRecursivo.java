
class Main {
  private static int somatorio(int x){
      if(x<=1) {return x;}
      return x + somatorio(x-1);
  }
  public static void main(String[] args) {
    int x = 5;
    System.out.println(somatorio(x));
  }
}