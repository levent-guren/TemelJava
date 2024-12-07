package tr.com.ornek.util;

import org.hibernate.query.NativeQuery;

import java.util.List;

public class DBUtils {
    public static List<Object> get(String tableName, Class sinif) {
       NativeQuery sorgu = HibernateUtil.getSession().createNativeQuery("select * from "+tableName, sinif);
       return sorgu.getResultList();
    }

}
