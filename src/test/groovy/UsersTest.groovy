import org.junit.Test

class UsersTest {

    @Test
    void 'should test Users pojo'() {

        Users users = new Users(id: 1, name: 'Tech Primers', salary: 90L)
        users.id = 1
        users.name = 'Tech Primers'
        users.salary = 90L




    }
}
