public class PicturePerformance extends Performance {
  final public int pictureSize; // MB
  PicturePerformance(int practiceTime, int pictureSize) {
    super(practiceTime);
    this.pictureSize = pictureSize;
  }
}
