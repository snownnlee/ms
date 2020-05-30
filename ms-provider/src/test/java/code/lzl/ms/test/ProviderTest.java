package code.lzl.ms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import code.lzl.ms.entity.Employee;
import code.lzl.ms.mapper.EmployeeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderTest {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Test
	public void testMapper() {
//		Employee employee = new Employee()
//				.setFirstName("孙")
//				.setLastName("悟空")
//				.setAge(800)
//				.setEmail("sunwukong@163.com")
//				.setGender(1);
//		employeeMapper.insert(employee);
		Employee employee = employeeMapper.selectById(5);
		System.out.println("哈哈哈哈哈啊哈哈"+employee);
	}

}
