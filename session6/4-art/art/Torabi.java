
public class Torabi extends Judge {
  public int score(Performance p) {
    //
    if (p instanceof MusicPerformance) {
      return 15 * p.practiceTime;
    } else if (p instanceof PeomPerformance) {
      return 12 * p.practiceTime;
    } else if (p instanceof PicturePerformance) {
      return 1 * p.practiceTime;
    } else {
      return 10 * p.practiceTime;
    }
  }
}
