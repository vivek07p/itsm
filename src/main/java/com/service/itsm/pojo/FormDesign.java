package com.service.itsm.pojo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="FORM_DESIGN")
public class FormDesign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="ROW_POSITION")
    private Integer rowPosition;

    @Column(name="COLUMN_POSITION")
    private Integer columnPosition;

    @Column(name="FIELD_WIDTH")
    private Integer fieldWidth;

    @Column(name="STYLE")
    private String style;

    @Column(name="TAB_NAME")
    private String tabName;

    public UUID getCoreId() {
        return coreId;
    }

    public void setCoreId(UUID coreId) {
        this.coreId = coreId;
    }

    public Integer getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(Integer rowPosition) {
        this.rowPosition = rowPosition;
    }

    public Integer getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(Integer columnPosition) {
        this.columnPosition = columnPosition;
    }

    public Integer getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(Integer fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }
}
