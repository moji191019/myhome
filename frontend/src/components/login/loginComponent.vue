<template>
  <div class="login" v-if="this.$root.loginPop">
    <div class="login_wrap" style="width: 420px;">
      <button class="close_btn" @click="handleCloseClick">
        <svg width="30" height="30" viewBox="0 0 32 32">
          <g fill="none" fill-rule="evenodd" transform="translate(1 1)">
            <circle class="Circle" cx="15" cy="15" r="15"></circle>
            <g class="Close" stroke-linecap="round" stroke-width="2">
              <path d="M19.243 19.243l-8.486-8.486M19.243 10.757l-8.486 8.486"></path>
            </g>
          </g>
        </svg>
      </button>
      <div class="form_wrap">
        <h1 class="form_title">로그인</h1>
        <div class="login_form">
          <input name="email" autocomplete="off" type="text" placeholder="아이디"
            class="login_form_email" value="">
          <input name="password" autocomplete="off" type="password" placeholder="비밀번호"
            class="login_form_pwd" value="">
          <div class="login_form_chkwrap">
            <label class="chkboxlabel" size="22">
              <input name="isSaved" type="checkbox" class="chkbox_ipt" value="">
              <span class="checkbox"></span>
              <p class="chkboxtxt">아이디 저장</p>
            </label>
            <a class="findpwd">비밀번호 찾기</a>
          </div>
          <button type="submit" class="login_btn">
            <span>로그인</span>
          </button>
        </div>
        <div class="sns_login_wrap">
          <button type="button" class="kko">
            <span>카카오톡으로 시작</span>
          </button>
          <button type="button" class="fab">
            <span>페이스북으로 시작</span>
          </button>
        </div>
        <div class="signup_wrap">
          <p>아직 회원이 아니세요?<a>이메일로 회원가입</a></p>
        </div>
      </div>
      <ul class="pro_owner_wrap">
        <li>
          <label class="pro_owner_label">공인중개사세요?</label>
          <a href="https://pro.dabangapp.com/#/terms" target="_blank" rel="noopener noreferrer"
            class="pro_link">
            <svg width="86" height="19" viewBox="0 0 86 19">
              <g fill="none" fill-rule="evenodd">
                  <path fill="#326CF9"
                    d="M0 0v12.546h8.865V8.962h-5.32V3.585h5.32V0zM11.524 0v7.17h3.546V3.584h3.546V0zM34.572 0v7.17h3.546V3.584h3.546V0zM28.367 0v2.688h-2.66V0h-3.545v12.546h9.75V0h-3.545zm-2.66 8.961h2.66V6.273h-2.66v2.688zM39.005 15.37a1.47 1.47 0 0 1-1.463-1.48 1.47 1.47 0 0 1 1.463-1.478 1.47 1.47 0 0 1 1.462 1.478 1.47 1.47 0 0 1-1.462 1.48m0-6.409c-2.693 0-4.876 2.207-4.876 4.93 0 2.722 2.183 4.928 4.876 4.928 2.692 0 4.875-2.206 4.875-4.929 0-2.722-2.183-4.929-4.875-4.929">
                  </path>
                  <path fill="#141414"
                    d="M52.033 7.45c.27 0 .527-.02.771-.06.244-.04.462-.11.654-.212.192-.1.345-.24.458-.
                      416.113-.176.17-.405.17-.687 0-.273-.057-.496-.17-.668a1.182 1.182 0 0 0-.451-.403 1.922 1.922 0 0 0-.64-.
                      192 5.82 5.82 0 0 0-.74-.046h-1.203V7.45h1.151zm-2.798-4.085h3.02a6.52 6.52 0 0 1 1.439.145c.427.097.793.256 1.098.
                      476.305.22.54.502.706.846.166.344.249.758.249 1.243 0 .52-.096.956-.288 1.308a2.348 2.348 0 0 1-.778.853 3.385
                      3.385 0 0 1-1.144.47 6.366 6.366 0 0 1-1.386.145h-1.269v3.873h-1.647v-9.36zM60.402 7.397c.235 0 .47-.018.706-.053s.447-.101.634-.198c.188-.
                      097.343-.236.465-.417.121-.18.183-.412.183-.694 0-.255-.057-.465-.17-.628a1.272 1.272 0 0 0-.432-.39 1.796 1.796 0 0 0-.595-.198 4.148 4.148
                      0 0 0-.647-.053h-1.49v2.63h1.346zm-2.994-4.032h3.216c.436 0 .859.046 1.269.139.41.092.773.244 1.092.456.318.211.573.489.765.832.191.344.287.763.287
                      1.256 0 .679-.19 1.232-.568 1.66-.38.427-.896.716-1.55.865l2.472 4.151h-1.988l-2.145-3.966h-1.203v3.966h-1.647v-9.36zM67.176 8.018c0
                      .502.076.963.229 1.381.152.42.37.783.653 1.091.284.309.62.549 1.007.72.388.173.818.259 1.288.259.471 0 .903-.086 1.295-.258.392-.172.73-
                      .412 1.014-.72.283-.31.5-.673.653-1.092.153-.418.23-.879.23-1.381 0-.484-.077-.934-.23-1.348a3.302 3.302 0 0 0-.647-1.084 3 3 0 0 0-1.007-
                      .727 3.155 3.155 0 0 0-1.308-.265 3.014 3.014 0 0 0-2.301.991c-.28.31-.495.67-.647 1.085a3.872 3.872 0 0 0-.23 1.348m-1.79 0c0-.749.124-1
                      .425.372-2.03a4.455 4.455 0 0 1 1.033-1.54c.44-.422.963-.748 1.57-.978a5.555 5.555 0 0 1 1.98-.343c.724 0 1.39.114 2.001.343a4.63 4.63 0 0 1 1
                      .582.979c.445.423.792.936 1.04 1.54.249.604.373 1.28.373 2.029 0 .732-.124 1.4-.373 2.003a4.624 4.624 0 0 1-1.04 1.56 4.72 4.72 0 0 1-1.582
                      1.018 5.378 5.378 0 0 1-2 .363 5.288 5.288 0 0 1-1.982-.363 4.655 4.655 0 0 1-1.569-1.018 4.665 4.665 0 0 1-1.033-1.56 5.217 5.217 0 0 1-
                      .373-2.003">
                  </path>
                  <g transform="translate(78.596 11.53)">
                    <path fill="#326CF9" d="M3.564.124v3.584H.018v3.585H7.11V.123z"></path>
                  </g>
              </g>
            </svg>
          </a>
        </li>
        <li>
          <label class="pro_owner_label">임대인이세요?</label>
          <a href="https://owner.dabangapp.com" target="_blank" rel="noopener noreferrer"
            class="owner_link">
            <svg width="91" height="19" viewBox="0 0 91 19">
              <g fill="none" fill-rule="evenodd">
                <path fill="#326CF9"
                  d="M0 .19v12.423h8.817v-3.55h-5.29V3.74h5.29V.19zM11.462.19V7.29h3.527v-3.55h3.527V.19zM34.387.19V7.29h3.527v-3.55h3.527V.19zM28.215.19v2.662H25.57V.19h-3.527v12.423h9.699V.19h-3.527zM25.57 9.063h2.645V6.401H25.57v2.662z">
                </path>
                <g transform="translate(0 .017)">
                  <path fill="#326CF9"
                    d="M38.795 15.39a1.46 1.46 0 0 1-1.454-1.463 1.46 1.46 0 0 1 1.454-1.464 1.46 1.46 0 0 1 1.455 1.464 1.46 1.46 0 0 1-1.455 1.464m0-6.345c-2.678 0-4.85 2.185-4.85 4.88 0 2.696 2.172 4.881 4.85 4.881 2.679 0 4.85-2.185 4.85-4.88 0-2.696-2.171-4.88-4.85-4.88">
                  </path>
                  <path fill="#141414"
                    d="M56.809 5.526h1.39v1.262h-1.39V9.54h-1.436V3.164h1.436v2.362zm-5.048 6.204v.275c0 .447.684.963 1.835.963 1.15 0 1.834-.516 1.834-.963v-.275c0-.447-.683-.963-1.834-.963s-1.835.516-1.835.963zm-1.413.367v-.459c0-1.227 1.31-2.052 3.248-2.052 1.937 0 3.247.825 3.247 2.052v.46c0 1.226-1.31 2.051-3.247 2.051-1.937 0-3.248-.825-3.248-2.052zm-.125-4.449h2.188V6.387h-2.188v1.261zm3.6 1.204H48.81V3.657h1.413v1.525h2.188V3.657h1.413v5.195zM60.193 3.75h7.315v1.226h-2.917v.092c0 .539.251.906.9 1.227.741.367 1.698.768 2.553 1.1l-.558 1.136c-.832-.333-1.653-.7-2.382-1.032-.66-.298-1.105-.574-1.219-.791h-.011c-.114.217-.616.516-1.277.814-.729.332-1.55.7-2.38 1.032l-.56-1.158a33.593 33.593 0 0 0 2.553-1.101c.65-.321.9-.688.9-1.227v-.092h-2.917V3.75zm8.512 5.389v1.226H64.58v3.464h-1.447v-3.464h-4.136V9.14h9.708z">
                  </path>
                  <path fill="#141414"
                    d="M76.966 10.755H78.4v-7.59h-1.435v7.59zm-3.863 1.72h5.47v1.239h-6.917v-3.578h1.447v2.34zM71.28 6.123v.436c0 .688.524 1.318 1.379 1.318.854 0 1.378-.63 1.378-1.318v-.436c0-.688-.524-1.319-1.378-1.319-.855 0-1.379.63-1.379 1.319zm-1.356.539V6.02c0-1.296 1.037-2.466 2.735-2.466s2.734 1.17 2.734 2.466v.642c0 1.296-1.036 2.465-2.734 2.465s-2.735-1.17-2.735-2.465z"
                    mask="url(#b)"></path>
                  <path fill="#326CF9" d="M87.302 11.711v3.55h-3.527v3.549h7.054V11.71z"></path>
                </g>
              </g>
            </svg>
          </a>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: 'loginComponent',
  computed: {

  },
  created() {
    console.log('loginComponent.vue: ', this, this.$root.loginPop);
    console.log(this.$root.loginPop);
  },
  methods: {
    handleCloseClick(e) {
      console.log('닫기버튼 클릭', e);
      this.$root.loginPop = false;
    },
  },
  data() {
    return {
    };
  },
};
</script>

<style scoped>

</style>
