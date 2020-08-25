public class Torabi extends Judge{
  public int score(Performance p){
      int t = p.practiceTime;
      if(p instanceof MusicPerformance){
        MusicPerformance mp = (MusicPerformance) p;
        int pt = mp.performanceTime;
        if(pt > 10)
          return 200;
        else return 15 * t;
      }
      else if(p instanceof PoemPerformance){
        PoemPerformance pp = (PoemPerformance) p;
        int lines = pp.lineCount;
        if (lines > 18) return 150;
        return 12 * t;
      }
      else if(p instanceof PicturePerformance){
        return 1 * t;
      }
      else{
        return 10 * t;
      }
  }
}
