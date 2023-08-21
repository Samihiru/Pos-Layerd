/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.dao.custom;

import pos.layerd.dao.CrudDao;
import pos.layerd.entity.CustomerEntity;
 

/**
 *
 * @author Samihiru
 */
public interface CustomerDao extends  CrudDao<CustomerEntity, String>{
    Boolean addCustomer(CustomerEntity customerEntity)throws Exception;
}
 