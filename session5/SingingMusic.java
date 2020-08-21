public class SingingMusic extends Music {

    String singerName;

    // implecity has 
    // name and len 
    // and all methods 

    public String getSingerName(){
        return this.singerName;
    }

    public SingingMusic(String name, int len, String singerName){
      //  super(len, name);
       this.len = len;
       this.name = name;


        this.singerName = singerName;
    }


}
