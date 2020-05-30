package code.lzl.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("employee")
public class Employee {

    /**
     *   `id` int(11) NOT NULL AUTO_INCREMENT,
     *   `first_name` varchar(20) DEFAULT NULL,
     *   `last_name` varchar(20) DEFAULT NULL,
     *   `age` int(11) DEFAULT NULL,
     *   `email` varchar(100) DEFAULT NULL,
     *   `gender` int(11) DEFAULT NULL,
     */
	@TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private Integer gender;

}
