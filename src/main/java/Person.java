/**
 * класс Человек
 */
public class Person {
    /** поле id */
    private String id;

    /** поле имя */
    private String name;

    /** поле пол */
    private String gender;

    /** поле дата рождения */
    private String BirthDate;

    /** поле подразделение */
    private Division division;

    /** поле зарплата */
    private String salary;

    /**
     * конструктор
     */
    public Person() { }

    /**
     * Конструктор
     * @param id1 id
     * @param name1 имя
     * @param gender1 пол
     * @param BirthDate1 дата рождения
     * @param division1 подразделение
     * @param salary1 зарплата
     * @param idd код подразделения
     */
    public Person(String id1, String name1, String gender1, String BirthDate1 , String division1, String salary1, int idd)
    {
        id = id1;
        name = name1;
        gender = gender1;
        BirthDate = BirthDate1;
        division = new Division(idd, division1);
        salary = salary1;
    }

    /**
     * получение id
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * получение имени
     * @return name
     */
    public String getName()
    {
        return name;
    }


    /**
     * получение пола
     * @return gender
     */
    public String getGender()
    {
        return gender;
    }


    /**
     * получение даты рождения
     * @return BirthDate
     */
    public String getBirthDate()
    {
        return BirthDate;
    }


    /**
     * получение названия подразделения
     * @return division.getTitle()
     */
    public String getDivisionTitle()
    {
        return division.getTitle();
    }


    /**
     * получение номера подразделения
     * @return division.getId()
     */
    public int getDivisionId()
    {
        return division.getId();
    }


    /**
     * получение зарплаты
     * @return salary
     */
    public String getSalary()
    {
        return salary;
    }


}