package sl314.beans;

public class ColorBean {

  private String red;
  private String green;
  private String blue;

  public ColorBean() {
    red = "FF";
    green = "FF";
    blue="FF";
  }

  public void setRed(String red) {
    this.red = red;
  }

  public String getRed() {
    return red;
  }

  public void setGreen(String green) {
    this.green = green;
  }

  public String getGreen() {
    return green;
  }

  public void setBlue(String blue) {
    this.blue = blue;
  }

  public String getBlue() {
    return blue;
  }

  public String getHexValue() {
    return red + green + blue;
  }

}
