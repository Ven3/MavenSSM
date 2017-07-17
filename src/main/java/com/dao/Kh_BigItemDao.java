package com.dao;

import com.entity.Kh_BigItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Han on 2017/07/14.
 */
@Repository
public interface Kh_BigItemDao {

    public List<Kh_BigItem> getAll();
}
