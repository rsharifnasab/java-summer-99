public class JafarOf extends Judge {
  public int score(Performance p) {
    //
    if (p instanceof MusicPerformance) {
      return 5 * p.practiceTime;
    } else if (p instanceof PeomPerformance) {
      return 5 * p.practiceTime;
    } else if (p instanceof PicturePerformance) {
      PicturePerformance temp = (PicturePerformance)p;
      if (temp.pictureSize < 10) {
        return 0;
      }
      return 30 * p.practiceTime;
    } else {
      return 10 * p.practiceTime;
    }
  }
}
