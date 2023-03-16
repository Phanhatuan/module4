package ss4.baiTap.BT3.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import ss4.baiTap.BT3.model.Declaration;

@Repository
public class DeclarationRepoImpl implements DeclarationRepo{
    private static Declaration form = new Declaration();
    @Override
    public void save(Declaration declaration) {
        form = declaration;
    }

    @Override
    public Declaration getForm() {
        return form;
    }
}
