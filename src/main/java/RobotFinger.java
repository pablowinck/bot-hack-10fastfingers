import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotFinger {

    private Robot robot;

    public RobotFinger(int delay) {
        try {
            robot = new Robot();
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // "Palavra"
    // ["p","a","l","a","v","r","a"]
    public void escrever(String texto) {
        char[] letras = texto.toCharArray();

        for (char letra : letras) {
            if (Character.isUpperCase(letra)) {
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.delay(getDelay());
                escreverLetra(letra);
                robot.delay(getDelay());
                robot.keyRelease(KeyEvent.VK_SHIFT);
            } else {
                escreverLetra(letra);
            }
        }
    }

    private int getDelay() {
        return (int) (Math.random() * (30 - 5) + 5);
    }

    private void escreverLetra(char letra) {
        int codigo = KeyEvent.getExtendedKeyCodeForChar(letra);

        if (codigo == KeyEvent.CHAR_UNDEFINED) {
            return;
        }
        this.robot.keyPress(codigo);
        this.robot.delay(getDelay());
        this.robot.keyRelease(codigo);
        this.robot.delay(getDelay());
    }

    public void space() {
        this.robot.keyPress(KeyEvent.VK_SPACE);
        this.robot.delay(getDelay());
        this.robot.keyRelease(KeyEvent.VK_SPACE);
        this.robot.delay(getDelay());
    }

}
