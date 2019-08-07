import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.*;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "com.qs")
@ImportResource(locations = "classpath:applicationContext.xml")
public class config {

}
