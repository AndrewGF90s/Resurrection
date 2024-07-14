import java.util.Arrays;

//Дана строка sql-запроса:
//select * from students where "
//Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
//Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
//String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
//Пример: Строка sql-запроса:
//select * from students where
//Параметры для фильтрации:
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Результат:
//select * from students where name='Ivanov' and country='Russia' and city='Moscow'
public class ParseJSON {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        String str = "I";
//        String str1 = " Love";
//        String str2 = " Java! ";
//        System.out.println(str.concat(str1).concat(str2).toUpperCase());
//        System.out.println(sb.append(str).append(str1).append(str2));
        String ans = "select * from students where";
        String JSON = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(Answer(ans, JSON));
    }

    public static StringBuilder Answer(String QUERY, String PARAMS) {
        String paramsRep = PARAMS.replace("{", "").replace("\"", "").replace("}", "");
        String name = paramsRep.split(",")[0].split(":")[1];
        String from = paramsRep.split(",")[1].split(":")[1];
        String town = paramsRep.split(",")[2].split(":")[1];
        StringBuilder sb = new StringBuilder(QUERY);
        if (!name.equals("NULL")) {
            sb.append(" name=").append("'").append(name).append("'");
        }
        if (!from.equals("NULL")) {
            sb.append(" and ").append("country=").append("'").append(from).append("'");
        }
        if (!town.equals("NULL")) {
            sb.append(" and ").append(" city=").append("'").append(town).append("'");
        }
        return sb;
    }

    ;
}
