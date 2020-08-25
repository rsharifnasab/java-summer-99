public class JafarOf extends Judge{
  public int score(Performance p){
      int t = p.practiceTime;
      if(p instanceof MusicPerformance){
        return 5 * t;
      }
      else if(p instanceof PoemPerformance){
        return 5 * t;
      }
      else if(p instanceof PicturePerformance){
        PicturePerformance pp = (PicturePerformance) p;
        if(pp.pictureSize < 10)
          return 0;
        else return 30 * t;
      }
      else{
        return 10 * t;
      }
  }
}
