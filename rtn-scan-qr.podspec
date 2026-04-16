require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name            = "rtn-scan-qr"
  s.version         = package["version"]
  s.summary         = package["description"]
  s.description     = package["description"]
  s.homepage        = "https://github.com/your-repo/rtn-scan-qr"
  s.license         = package["license"]
  s.platforms       = { :ios => "13.0" }
  s.author          = "Your Name"
  s.source          = { :git => "https://github.com/your-repo/rtn-scan-qr.git", :tag => "#{s.version}" }

  s.source_files    = "ios/**/*.{h,m,mm,swift}"

  install_modules_dependencies(s)
end
