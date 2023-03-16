package ss4.baiTap.BT3.repository;

import ss4.baiTap.BT3.model.Declaration;

public interface DeclarationRepo {
    void save(Declaration declaration);
    Declaration getForm();
}
