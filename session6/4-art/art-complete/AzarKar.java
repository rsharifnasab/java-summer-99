public class AzarKar extends Judge{
  public int score(Performance p){
      int t = p.practiceTime;
      if(p instanceof MusicPerformance){
        MusicPerformance mp = (MusicPerformance) p;
        int pt = mp.performanceTime;
        if(pt < 5 && t < 3)
          return 200;
        else return 10 * t;
      }
      else if(p instanceof PoemPerformance){
        return 8 * t;
      }
      else if(p instanceof PicturePerformance){
        return 2 * t;
      }
      else{
        return t * t / 2;
      }
  }
}
