package per.mike.example.face.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;
}
