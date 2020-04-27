package cn.edu.nju.tis.serviceImpl;

import cn.edu.nju.tis.model.InformationItem;
import cn.edu.nju.tis.repository.InformationItemRepository;
import cn.edu.nju.tis.service.InfoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoItemServiceImpl implements InfoItemService {

    @Autowired
    private InformationItemRepository informationItemRepository;

    @Override
    public List<InformationItem> findAllInformationItems() {
        return  informationItemRepository.findAllInformationItems();
    }
}
