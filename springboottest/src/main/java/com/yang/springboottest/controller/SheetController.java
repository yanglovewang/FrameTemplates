package com.yang.springboottest.controller;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;
import java.io.IOException;
import java.util.Iterator;

/**
 * 有关文件上传
 */
@Controller
@RequestMapping("/sheet")
public class SheetController {

    private Logger logger = LoggerFactory.getLogger(SheetConditionalFormatting.class);

    @RequestMapping("/file")
    @ResponseBody
    public String getFile(@RequestParam("file") MultipartFile file) {
        Workbook wk = null;
        try {
            String originalFilename = file.getOriginalFilename();
            System.out.println(originalFilename);
            wk = WorkbookFactory.create(file.getInputStream());
            System.out.println("success");
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = wk.getSheetAt(0);
        if (!StringUtils.isEmpty(sheet)) {
            Row row = sheet.getRow(1);
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellStr = cellString(cell);
                System.out.println(cellStr);
            }
        } else {
            logger.info("sheet empty");
        }
        return "success";
    }

    /**
     * 处理单元格
     * @param cell
     * @return 单元格字符串
     */
    private String cellString(Cell cell) {
        CellType cellTypeEnum = cell.getCellTypeEnum();
        String result = null;
        switch (cellTypeEnum) {

            case _NONE:
                result = "none";
                break;
            case NUMERIC:
                result = cell.toString();
                break;
            case STRING:
                result = cell.toString();
                break;
            case FORMULA:
                result = cell.getCellFormula().trim().toString();
                break;
            case BLANK:
                result = cell.toString();
                break;
            case BOOLEAN:
                result = cell.toString();
                break;
            case ERROR:
                result = "error";
                break;
        }

        return result;
    }

    @RequestMapping("/filePage")
    public String index() {
        return "file";
    }

}
