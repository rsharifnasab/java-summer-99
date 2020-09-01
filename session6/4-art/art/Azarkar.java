public class Azarkar extends Judge {
  public int score(Performance p) {
    //
    if (p instanceof MusicPerformance) {
      MusicPerformance temp = (MusicPerformance)p;

      if (temp.practiceTime < 3 && temp.performanceTime < 5)
        return 200;
      return 10 * p.practiceTime;
    } else if (p instanceof PeomPerformance) {

      return 8 * p.practiceTime;
    } else if (p instanceof PicturePerformance) {
      return 2 * p.practiceTime;
    } else {
      int t = p.practiceTime;
      return (int)(1.0 / 2.0 * t * t);
    }
  }
}
