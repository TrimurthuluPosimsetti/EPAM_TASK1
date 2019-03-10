import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x[]=new int[n+1];
    for(int i=1;i<=n;i++){
      x[i]=0;
    }
    Nqueen(1,n,x);
  }
  public static void Nqueen(int k,int n,int x[]){
    for(int j=1;j<=n;j++){
      if(Place(k,j,x)){
        x[k]=j;
        if(k==n){
          for(int i=1;i<=n;i++){
            System.out.print(x[i]+" ");
          }
          System.out.println();
        }
        else{
          Nqueen(k+1,n,x);
        }
      }
    }
  }
  public static boolean Place(int k,int j,int x[]){
    for(int i=1;i<=k-1;i++){
      if(x[i]==j || Math.abs(x[i]-j)==Math.abs(k-i)){
          return false;
      }
    }
    return true;
  }  
}
