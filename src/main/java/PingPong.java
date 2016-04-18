
import java.util.ArrayList;

public class PingPong{
  public static void main(String[] args){}


  public ArrayList listPingPong(Integer num){
    if(num != null){
      ArrayList<Object> pongList = new ArrayList<Object>();
      for(Integer index = 0; index <= num; index ++){
        pongList.add(index);

      }
      return pongList;
    }else {
      ArrayList<Object> noList = new ArrayList<Object>();
      return noList;
    }
  }
}
