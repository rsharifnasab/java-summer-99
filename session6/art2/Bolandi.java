public class Bolandi extends Judge{
  public int score(Performance p){
      int t = p.practiceTime;
      if(p instanceof MusicPerformance){
        return 5 * t;
      }
      else if(p instanceof PoemPerformance){
        PoemPerformance pp = (PoemPerformance) p;
        int lines = pp.lineCount;
        if ( t*1.0/lines > 32) return 320;
        return 15 * t;
      }
      else if(p instanceof PicturePerformance){
        return 7 * t;
      }
      else{
        return 10 * t;
      }
  }
}
