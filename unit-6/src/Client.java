public class Client extends Person implements Printable, SeasonHandler {

    private int money;
    public String surname;

    public Client(String name, String birthday, String surname, int money) {
        super(name, birthday);
        this.surname = surname;
        this.money = money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return this.money;
    }

    public int spendMoney(int money) {
        if (this.money < money) {
            return 0;
        }
        return this.money - money;
    }

    @Override
    public void print() {
        System.out.println("Имя " + this.getName() + "; Фамилия: " + this.surname + "; Дата рождения: " + this.getBirthday());
    }

    @Override
    public String getColorOfSeason() {
        return "Сейчас время года - " + Season.SUMMER + "\nЦвет сезона - " + Season.SUMMER.getColor();
    }
}
