package io.choerodon.issue.api.dto;

/**
 * @author peng.jiang@hand-china.com
 */
public class StateMachineConfigDTO {

    private Long id;
    private Long transfId;
    private Long stateMachineId;
    private String code;
    private String type;

    private String description; //条件描述

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransfId() {
        return transfId;
    }

    public void setTransfId(Long transfId) {
        this.transfId = transfId;
    }

    public Long getStateMachineId() {
        return stateMachineId;
    }

    public void setStateMachineId(Long stateMachineId) {
        this.stateMachineId = stateMachineId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
