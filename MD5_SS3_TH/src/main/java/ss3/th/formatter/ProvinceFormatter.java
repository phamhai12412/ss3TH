package ss3.th.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import ss3.th.model.Province;
import ss3.th.service.province.IProvinceService;


import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
// Class này tạo ra nhằm mục đích ép kiểu id Province từ text về Long
// (Bởi vì id Province select từ views là kiểu dữ liệu String)
public class ProvinceFormatter implements Formatter<Province> {
    private IProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(IProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        Optional<Province> provinceOptional = provinceService.findById(Long.parseLong(text));
        return provinceOptional.orElse(null);
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
