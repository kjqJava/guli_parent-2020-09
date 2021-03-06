package com.atguigu.eduservice.entity.chapter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孔佳齐丶
 * @create 2020-09-08 11:18
 * @package com.atguigu.eduservice.entity.chapter
 */
@Data
public class ChapterVo {
    private String id;
    private String title;

    private List<VideoVo> children = new ArrayList<>();
}
