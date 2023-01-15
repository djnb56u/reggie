package com.jingchua.reggie.dto;

import com.jingchua.reggie.entity.Setmeal;
import com.jingchua.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
