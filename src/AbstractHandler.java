/**Потрібно: Створити клас AbstractHandler.
 * У тілі класу створити методи void open(), void create(), void change(), void save().
 * Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
 * Написати програму, яка виконуватиме визначення документа і для кожного формату мають бути методи
 * відкриття, створення, редагування, збереження певного формату документа.
 */

abstract class AbstractHandler {
    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();
}

class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Opening XML file...");
    }

    @Override
    public void create() {
        System.out.println("Creating XML file...");
    }

    @Override
    public void change() {
        System.out.println("Changing XML file...");
    }

    @Override
    public void save() {
        System.out.println("Saving XML file...");
    }
}

class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Opening TXT file...");
    }

    @Override
    public void create() {
        System.out.println("Creating TXT file...");
    }

    @Override
    public void change() {
        System.out.println("Changing TXT file...");
    }

    @Override
    public void save() {
        System.out.println("Saving TXT file...");
    }
}
  // extends - уападкування від абстрактного класу
class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Opening DOC file...");
    }

    @Override
    public void create() {
        System.out.println("Creating DOC file...");
    }

    @Override
    public void change() {
        System.out.println("Changing DOC file...");
    }

    @Override
    public void save() {
        System.out.println("Saving DOC file...");
    }
}

    class NewAbstract {
    public static void main(String[] args) {
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();

        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();

        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();
    }
}