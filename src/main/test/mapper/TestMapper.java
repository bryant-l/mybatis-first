package mapper;

import com.work.bryant.entity.User;
import com.work.bryant.mapper.IUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestMapper {
    public static void main(String[] args) {
        /**
         * 加载文件
         */
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(
            TestMapper.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        /**
         * 原生mybatis，默认为false,相当于Connection,开启连接
         */
        SqlSession sqlSession = build.openSession(true);

        /**
         *获取Mapper
         */
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);

        /**
         * 启动msql
         */
        List<User> users = mapper.selectAll(1);

/*        System.out.println(users.toString());*/
        for (User user:users) {
            System.out.println(user);
        }
    }
}
