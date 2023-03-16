package ss4.baiTap.BT3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ss4.baiTap.BT3.model.Declaration;
import ss4.baiTap.BT3.repository.DeclarationRepo;

@Service
public class DeclarationServiceImpl implements DeclarationService{
    @Autowired
    private DeclarationRepo declarationRepository;

    @Override
    public void save(Declaration declaration) {
        declarationRepository.save(declaration);
    }

    @Override
    public Declaration getForm() {
        return declarationRepository.getForm();
    }
}
