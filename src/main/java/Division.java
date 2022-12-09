/**
 * Класс Подразделение
 */
public class Division {
    /**поле номер подразделения*/
    private int id;

    /**поле название подразделения*/
    private String title;

    /**
     * Конструктор
     * @param id1 номер
     * @param title1 название
     */
    public Division( int id1, String title1)
    {
        id = id1;
        title = title1;
    }

    /**
     * получение номера подразделения
     * @return id
     */
    public int getId()
    {
        return id;
    }

    /**
     * получение названия подразделения
     * @return this.title
     */
    public String getTitle()
    {
        return this.title;
    }
}