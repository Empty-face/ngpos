package edu.com.ngpos.mapper;

import edu.com.ngpos.domain.ProductDescription;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductMapper {
    public ProductDescription getProductBySn(String productSn);

    public List<ProductDescription> listAllProduct();
    /**
     * 查询单个产品
     * @param productId 主键
     * @return 对象
     */
    public ProductDescription selectProductById(Long productId);
    /**
     * 查询产品列表
     * @param productDescription 查询参数
     * @return 对象集合
     */
    public List<ProductDescription> selectProductList(ProductDescription productDescription);

    /**
     * 新增产品
     * @param productDescription
     * @return 影响记录数
     */
    public int insertProduct(ProductDescription productDescription);
    /**
     * 修改产品
     * @param productDescription
     * @return 影响记录数
     */
    public int updateProduct(ProductDescription productDescription);
    /**
     * 删除产品
     * @param productId 主键
     * @return 影响记录数
     */
    public int deleteProductById(Long productId);

}
