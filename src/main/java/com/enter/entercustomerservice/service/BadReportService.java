package com.enter.entercustomerservice.service;

import com.enter.entercustomerservice.dto.entity.BadReportDTO;
import com.enter.entercustomerservice.service.infc.Cruder;

import java.util.List;

/**
 * @author Liquid
 * @类名： BadReportService
 * @描述：
 * @date 2019/9/25
 */
public interface BadReportService extends Cruder<BadReportDTO> {

    //void insertBadReportDTO(BadReportDTO badReportDTO, String realPath, MultipartFile[] files);

    void insertBadReportDTO(BadReportDTO badReportDTO) throws Exception;
    void deleteByPrimary(BadReportDTO badReportDTO);
    void updateByPrimary(BadReportDTO badReportDTO);
    BadReportDTO selectByPrimary(BadReportDTO badReportDTO);
    List<BadReportDTO> selectAll();

}
