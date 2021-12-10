import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class app {
    public static void main(String[] args) {
        String getWords = "name@turn@word@why@tell@plant@those@again@later@city@place@go@walk@live@high@said@well@another@end@cut@other@grow@been@story@every@small@between@about@every@boy@feet@after@there@paper@its@house@miss@find@take@before@because@sound@men@word@play@new@with@get@try@last@about@follow@state@did@list@open@Indian@each@they@quickly@too@before@same@just@land@time@study@same@go@city@those@work@sentence@these@above@people@from@mountain@was@her@mother@eat@girl@family@point@enough@in@boy@back@man@mean@to@through@give@come@add@my@mother@move@right@always@group@follow@were@should@some@the@soon@father@first@down@if@see@and@important@me@play@line@over@make@such@are@stop@can@end@its@does@large@went@take@seem@different@line@oil@something@just@along@tree@carry@begin@him@at@most@carry@people@question@be@by@live@form@plant@them@could@answer@grow@talk@so@plant@my@seem@watch@leave@idea@got@also@between@sometimes@put@always@number@both@as@who@father@good@night@long@night@home@kind@song@say@family@what@once@sometimes@there@night@been@number@state@open@river@put@next@such@made@school@also@food@when@year@small@house@came@way@we@those@story@him@mountain@mile@quite@another@little@come@back@old@walk@went@if@could@first@my@why@something@write@need@it's@earth@day@it@how@our@talk@they@took@think@show@your@in@go@last@but@into@face@head@close@page@it@most@man@down@him@without@them@even@then@almost@let@children@line@play@try@us@without@more@let@it's@do@were@water@us@men@study@look@now@very@the@it's@watch@don't@both@get@out@at@one@saw@first@oil@add@air@why@watch@are@mean@great@work@list@day@don't@until@list@children@been@tell@spell@in@on@water@oil@you@hard@idea@really@while@cut@year@he@with@near@off@find@no@between@hard@quick@four@use@let@state@own@or@has@idea@of@form@much@add@at@boy@see@paper@will@thought@life@said@sea@car@each@must@name@side@would@place@his@its@still@people@here@new@to@animal@want@from@soon@set@show@give@below@very@walk@left@need@point@own@got@example@sometimes@high@thought@without@bein";

        // RobotFinger robot = new RobotFinger(5000);

        // String[] words = getWords.split("@");
        // for (String word : words) {
        // robot.escrever(word);
        // robot.space();
        // }

        try {
            Robot robot = new Robot();
            // clica no primeiro ícone da barra de tarefas
            robot.mouseMove(75, 1050);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(100);

            // abre nova aba
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // deixa o site no clipboard
            String site = "https://10fastfingers.com/typing-test/english";
            StringSelection stringSelection = new StringSelection(site);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            // cola (CTRL+V)
            robot.delay(300);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(100);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(2000);

            // dev mode navegador (CTRL+SHIFT+I)
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(200);

            // clica em network
            robot.mouseMove(400, 660);
            robot.delay(500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(500);

            // // reload page
            // robot.keyPress(KeyEvent.VK_F5);
            // robot.keyRelease(KeyEvent.VK_F5);
            // robot.delay(2000);

            // clica em reload words
            robot.mouseMove(1230, 380);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // clica em filter
            robot.mouseMove(100, 730);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(100);
            // da CTRL+A e DELETA
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_DELETE);
            robot.keyRelease(KeyEvent.VK_DELETE);

            // filtra por get_words
            stringSelection = new StringSelection("get_words");
            clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            // da CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // clica em get_words
            robot.mouseMove(100, 900);
            robot.delay(300);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // clica no texto get_words
            robot.mouseMove(700, 950);
            robot.delay(300);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // da CTRL+A e COPIA para o clipboard
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);

        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
