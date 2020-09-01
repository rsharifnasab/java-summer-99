public class Bolandi extends Judge {
  public int score(Performance p) {
    //
    if (p instanceof MusicPerformance) {
      return 5 * p.practiceTime;
    } else if (p instanceof PeomPerformance) {
      return 15 * p.practiceTime;
    } else if (p instanceof PicturePerformance) {
      return 7 * p.practiceTime;
    } else {
      return 10;
    }
  }
}
