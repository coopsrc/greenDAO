package de.greenrobot.dao.unittest;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig minimalEntityDaoConfig;

    private final MinimalEntityDao minimalEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        minimalEntityDaoConfig = daoConfigMap.get(MinimalEntityDao.class).clone();
        minimalEntityDaoConfig.initIdentityScope(type);

        minimalEntityDao = new MinimalEntityDao(minimalEntityDaoConfig, this);

        registerDao(MinimalEntity.class, minimalEntityDao);
    }
    
    public void clear() {
        minimalEntityDaoConfig.getIdentityScope().clear();
    }

    public MinimalEntityDao getMinimalEntityDao() {
        return minimalEntityDao;
    }

}