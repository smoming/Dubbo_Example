package per.mike.example.face.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DXC Mike
 * @date 2022年10月20日
 * @remark
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderPo implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private String orderId;
    private String productId;
    private BigDecimal amount;
}
