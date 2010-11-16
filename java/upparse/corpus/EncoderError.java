package upparse.corpus;

/** Error with {@link TagEncoder}
 * @author ponvert@mail.utexas.edu (Elias Ponvert)
 */
public class EncoderError extends Exception {
  private static final long serialVersionUID = 1L;

  public EncoderError(String e) {
    super(e);
  }
}
